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

public class PlayingCard implements Comparable<PlayingCard> {
	public char suit; // one of: C, S, H, D
	public char num; // one of: A, 2 to 9, T, J, Q, K

	public PlayingCard(char suit, char num) {
		this.suit = suit;
		this.num = num;
	}

	@Override
	public String toString() {
		return String.format("[%02d] - %c %c", getOrder(), suit, num);
	}

	public int getOrder() {
		int val = 0;
		switch (suit) {
		case 'C': val += 0; break;
		case 'S': val += 13; break;
		case 'H': val += 26; break;
		case 'D': val += 39; break;
		}

		switch (num) {
		case 'A': val += 1; break;
		case 'T': val += 10; break;
		case 'J': val += 11; break;
		case 'Q': val += 12; break;
		case 'K': val += 13; break;
		default: val += num - '0'; break;
		}

		return val;
	}

	@Override
	public int compareTo(PlayingCard other) {
		return getOrder() - other.getOrder();
	}
}
