/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.purpleair.internal;

/**
 * The {@link purpleairChannel} Enum defines common constants, which are
 * used across the whole binding.
 *
 * @author Zack Lapinski - Initial contribution
 */
public enum purpleairChannel {

    CHANNEL_LASTSEEN("lastseen", "Lastseen"),
    CHANNEL_PM1VALUE("pm1value", "field1"),
    CHANNEL_PM25VALUE("pm25value", "PM2_5Value"),
    CHANNEL_PM10VALUE("pm10value", "field3"),
    CHANNEL_RSSI("rssi", "RSSI"),
    CHANNEL_TEMPF("temperature", "temp_f"),
    CHANNEL_HUMIDITY("humidity", "humidity"),
    CHANNEL_PRESSURE("pressure", "pressure"),
    CHANNEL_LABEL("label", "Label"),
    CHANNEL_LAT("latitude", "Lat"),
    CHANNEL_LON("longitude", "Lon");

    private final String id;
    private final String index;

    purpleairChannel(String id, String index) {
        this.id = id;
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public String getIndex() {
        return index;
    }
}
