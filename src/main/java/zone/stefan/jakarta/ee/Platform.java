/*
 * Copyright (C) 2022  Stefan Kühnel
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package zone.stefan.jakarta.ee;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * A Platform.
 * 
 * @author Stefan Kühnel, git@stefankuehnel.com
 * @version last modified 2022-05-04
 */

@Named
@RequestScoped
public class Platform {
	/**
	 * Name of the platform.
	 */
	private String name = "Jakarta.ee";

	/**
	 * Name of the platform.
	 * 
	 * @return Name. Not empty, not null.
	 */
	public String getName() {
		return name;
	}
}