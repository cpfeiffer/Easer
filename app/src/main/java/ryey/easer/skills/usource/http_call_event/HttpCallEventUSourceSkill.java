/*
 * Copyright (c) 2016 - 2018 Rui Zhao <renyuneyun@gmail.com>
 *
 * This file is part of Easer.
 *
 * Easer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Easer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Easer.  If not, see <http://www.gnu.org/licenses/>.
 */

package ryey.easer.skills.usource.http_call_event;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;

import androidx.annotation.NonNull;

import ryey.easer.commons.local_skill.ValidData;
import ryey.easer.commons.local_skill.conditionskill.Tracker;
import ryey.easer.commons.local_skill.eventskill.Slot;
import ryey.easer.commons.local_skill.usource.USourceDataFactory;
import ryey.easer.commons.local_skill.usource.USourceSkill;
import ryey.easer.skills.SkillViewFragment;

public class HttpCallEventUSourceSkill implements USourceSkill<HttpCallEventUSourceData> {

    @NonNull
    @Override
    public String id() {
        return "http_call_event";
    }

    @Override
    public int name() {
        //TODO
    }

    @Override
    public boolean isCompatible(@NonNull final Context context) {
        //TODO
    }

    @Override
    public Boolean checkPermissions(@NonNull Context context) {
        //TODO
    }

    @Override
    public void requestPermissions(@NonNull Activity activity, int requestCode) {
    }

    @NonNull
    @Override
    public USourceDataFactory<HttpCallEventUSourceData> dataFactory() {
        return new HttpCallEventUSourceDataFactory();
    }

    @NonNull
    @Override
    public SkillViewFragment<HttpCallEventUSourceData> view() {
        return new HttpCallEventSkillViewFragment();
    }

    @Override
    public Slot<HttpCallEventUSourceData> slot(@NonNull Context context, @NonNull HttpCallEventUSourceData data) {
        return new HttpCallEventSlot(context, data);
    }

    @Override
    public Slot<HttpCallEventUSourceData> slot(@NonNull Context context, @NonNull HttpCallEventUSourceData data, boolean retriggerable, boolean persistent) {
        return new HttpCallEventSlot(context, data, retriggerable, persistent);
    }

    @NonNull
    @Override
    public Tracker<HttpCallEventUSourceData> tracker(@NonNull Context context,
                                            @ValidData @NonNull HttpCallEventUSourceData data,
                                            @NonNull PendingIntent event_positive,
                                            @NonNull PendingIntent event_negative) {
        return new HttpCallEventTracker(context, data, event_positive, event_negative);
    }

}
