/*
 * This file is part of the BleachHack distribution (https://github.com/BleachDrinker420/bleachhack-1.14/).
 * Copyright (c) 2019 Bleach.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bleach.hack.module.mods;

import bleach.hack.module.Category;
import bleach.hack.module.Module;
import net.minecraft.util.Util;

public class StarGithubPls extends Module {

	public StarGithubPls() {
		super("StarGithubPls", -1, Category.MISC, "i need to feed my 420 children pls star github", null);
	}
	
	public void onEnable() {
		try {
			Util.getOSType().openURI("https://github.com/BleachDrinker420/bleachhack-1.14");
		} catch (Exception e) {e.printStackTrace();}
		
		this.setToggled(false);
	}

}
