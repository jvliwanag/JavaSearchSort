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

import java.util.Comparator;

public class PusoyDosComparator implements Comparator<PlayingCard> {
  public int compare(PlayingCard a, PlayingCard b) {
    return getCardValue(a) - getCardValue(b);
  }

  public int getCardValue(PlayingCard a) {
	int val = 0;

	switch(a.suit) {
	case 'C': val = 0; break;
	case 'S': val = 13; break;
	case 'H': val = 26; break;
	case 'D': val = 39; break; 
	}

    switch(a.num) {
	case 'T': val += 8; break;
	case 'J': val += 9; break;
	case 'Q': val += 10; break;
	case 'K': val += 11; break;
    case 'A': val += 12; break;
    case '2': val += 13; break;
	default: val += a.num - '0' - 2; break;
	}

	return val;
  }
}
