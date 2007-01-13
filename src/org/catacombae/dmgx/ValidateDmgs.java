/*-
 * Copyright (C) 2006 Erik Larsson
 * 
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

package org.catacombae.dmgx;

import java.util.LinkedList;
import java.io.*;

/**
 * Wrapper to allow processing of a list of dmg files. (I was too lazy
 * to write a shell script for this..)
 */
public class ValidateDmgs {
    public static void main(String[] args) throws IOException {
	LinkedList<String> fileList = new LinkedList<String>();
	for(String currentList : args) {
	    try {
		BufferedReader listIn = new BufferedReader(new InputStreamReader(new FileInputStream(new File(currentList))));
		String currentDmg = listIn.readLine();
		while(currentDmg != null) {
		    fileList.add(currentDmg);
		    currentDmg = listIn.readLine();
		}
	    } catch(IOException ioe) {
		ioe.printStackTrace();
	    }
	}
	ValidateDmg.main(fileList.toArray(new String[fileList.size()]));
    }
}
