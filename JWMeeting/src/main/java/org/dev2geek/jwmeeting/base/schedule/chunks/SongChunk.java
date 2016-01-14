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

/**
 * Class: SongChunk
 *
 * @author Mircha Emanuel `ryuujin` D'Angelo
 * @version 1
 */
public class SongChunk extends MeetingChunk {
    private final int songNumber;
    private final String songTheme;

    public SongChunk(int songNumber, String songTheme) {
        this.songNumber = songNumber;
        this.songTheme = songTheme;
    }

    public int getSongNumber() {
        return songNumber;
    }

    public String getSongTheme() {
        return songTheme;
    }
}

    