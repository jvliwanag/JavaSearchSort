/**
 *  This file is part of JavaSearchSort.
 * 
 *  JavaSearchSort is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *   
 *  JavaSearchSort is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with JavaSearchSort.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Arrays;
import java.util.Comparator;

public class SampleRun {
	public static void main(String... args) {
		PlayingCard[] cards = {
				new PlayingCard('H', '3'),
				new PlayingCard('S', '2'),
				new PlayingCard('S', '4'),
				new PlayingCard('H', '9'),
				new PlayingCard('H', 'J') };

		System.out.println("Init");
		printCards(cards);
		System.out.println("----");

		Arrays.sort(cards);

		System.out.println("Sorted");
		printCards(cards);
		System.out.println("----");
		
		PusoyDosComparator pdComp = new PusoyDosComparator();
		Arrays.sort(cards, pdComp);

		System.out.println("Pusoy Dos Sorted");
		printCards(cards);
		System.out.println("----");
		
		
		Arrays.sort(cards, new Comparator<PlayingCard>() {
			@Override
			public int compare(PlayingCard a, PlayingCard b) {
				return b.compareTo(a);
			}
		});
		System.out.println("Reverse Sort");
		printCards(cards);
		System.out.println("----");
	}

	public static void printCards(PlayingCard[] cards) {
		for (PlayingCard c : cards)
			System.out.println(c);
	}
}
