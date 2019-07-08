package org.linphone.utils;

/*
LinphoneShortcutManager.java
Copyright (C) 2019 Belledonne Communications, Grenoble, France

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.util.ArraySet;
import java.util.Set;

@TargetApi(25)
public class LinphoneShortcutManager {
    private Context mContext;
    private Set<String> mCategories;

    public LinphoneShortcutManager(Context context) {
        mContext = context;
        mCategories = new ArraySet<>();
        mCategories.add(ShortcutInfo.SHORTCUT_CATEGORY_CONVERSATION);
    }
}
