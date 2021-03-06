/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.onkyo;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableSet;

/**
 * The {@link OnkyoBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Paul Frank - Initial contribution
 */
public class OnkyoBindingConstants {

    public static final String BINDING_ID = "onkyo";

    // Extend this set with all successfully tested models
    public final static Set<String> SUPPORTED_DEVICE_MODELS = ImmutableSet.of("TX-NR509", "TX-NR535", "TX-NR555",
            "TX-NR646");

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_ONKYOAV = new ThingTypeUID(BINDING_ID, "onkyoAVR");
    public final static ThingTypeUID THING_TYPE_ONKYO_UNSUPPORTED = new ThingTypeUID(BINDING_ID, "onkyoUnsupported");
    public final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_ONKYOAV,
            THING_TYPE_ONKYO_UNSUPPORTED);

    // List of thing parameters names
    public final static String HOST_PARAMETER = "ipAddress";
    public final static String TCP_PORT_PARAMETER = "port";

    // List of all Channel ids
    public final static String CHANNEL_POWER = "zone1#power";
    public final static String CHANNEL_INPUT = "zone1#input";
    public final static String CHANNEL_MUTE = "zone1#mute";
    public final static String CHANNEL_VOLUME = "zone1#volume";
    public final static String CHANNEL_CONTROL = "player#control";
    public final static String CHANNEL_CURRENTPLAYINGTIME = "player#currentPlayingTime";
    public final static String CHANNEL_ARTIST = "player#artist";
    public final static String CHANNEL_TITLE = "player#title";
    public final static String CHANNEL_ALBUM = "player#album";
    public final static String CHANNEL_LISTENMODE = "player#listenmode";
    public final static String CHANNEL_POWERZONE2 = "zone2#power";
    public final static String CHANNEL_INPUTZONE2 = "zone2#input";
    public final static String CHANNEL_MUTEZONE2 = "zone2#mute";
    public final static String CHANNEL_VOLUMEZONE2 = "zone2#volume";

    // Used for Discovery service
    public final static String MANUFACTURER = "ONKYO";
    public final static String UPNP_DEVICE_TYPE = "MediaRenderer";

}
