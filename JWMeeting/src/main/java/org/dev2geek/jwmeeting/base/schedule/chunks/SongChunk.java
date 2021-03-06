/*******************************************************************************
 * This file is part of JWMeeting.
 * <p>
 * JWMeeting is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * JWMeeting is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with JWMeeting.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.dev2geek.jwmeeting.base.schedule.chunks;

import com.google.common.base.Preconditions;

/**
 * Class: SongChunk
 *
 * @author Mircha Emanuel `ryuujin` D'Angelo
 * @version 1
 */
public class SongChunk extends MeetingChunk {
    private static final long serialVersionUID = 2010711722935308130L;
    private final int number;
    private final String theme;

    public SongChunk(int number, String theme) {
        Preconditions.checkArgument(number > 0, "number might be greater than 0");
        this.number = number;
        this.theme = theme != null ? theme : "";
    }

    public int getNumber() {
        return number;
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public String toString() {
        return "SongChunk{" +
                "number=" + number +
                ", theme='" + theme + '\'' +
                ", executed='" + isExecuted() + '\'' +
                '}';
    }
}

    