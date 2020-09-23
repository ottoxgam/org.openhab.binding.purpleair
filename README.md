# purpleair Binding

_Give some details about what this binding is meant for - a protocol, system, specific device._

_If possible, provide some resources like pictures, a YouTube video, etc. to give an impression of what can be done with this binding. You can place such resources into a `doc` folder next to this README.md._

## Supported Things

_Please describe the different supported things / devices within this section._
_Which different types are supported, which models were tested etc.?_
_Note that it is planned to generate some part of this based on the XML files within ```src/main/resources/ESH-INF/thing``` of your binding._

## Discovery

_Describe the available auto-discovery features here. Mention for what it works and what needs to be kept in mind when using it._

## Binding Configuration

_If your binding requires or supports general configuration settings, please create a folder ```cfg``` and place the configuration file ```<bindingId>.cfg``` inside it. In this section, you should link to this file and provide some information about the options. The file could e.g. look like:_

```
# Configuration for the Philips Hue Binding
#
# Default secret key for the pairing of the Philips Hue Bridge.
# It has to be between 10-40 (alphanumeric) characters
# This may be changed by the user for security reasons.
secret=openHABSecret
```

_Note that it is planned to generate some part of this based on the information that is available within ```src/main/resources/ESH-INF/binding``` of your binding._

_If your binding does not offer any generic configurations, you can remove this section completely._

## Thing Configuration

_Describe what is needed to manually configure a thing, either through the (Paper) UI or via a thing-file. This should be mainly about its mandatory and optional configuration parameters. A short example entry for a thing file can help!_

_Note that it is planned to generate some part of this based on the XML files within ```src/main/resources/ESH-INF/thing``` of your binding._

## Channels

_Here you should provide information about available channel types, what their meaning is and how they can be used._

_Note that it is planned to generate some part of this based on the XML files within ```src/main/resources/ESH-INF/thing``` of your binding._

| channel         | type   | description                                           |
|-----------------|--------|-------------------------------------------------------|
| pm1value        | number | PM1.0 (CF=ATM) ug/m3                                  |
| pm25value       | number | PM2.5 (CF=1) ug/m3 This is the field to use for PM2.5 |
| pm10value       | number | PM10.0 (CF=ATM) ug/m3                                 |
| rssi            | number | Station RSSI                                          |
| lastseen        | number | The timestamp of the last PurpleAir update.           |
| uptime          | number | Station uptime                                        |
| Humidity        | number | Current Humidity                                      |
| Pressure        | number | Current Pressure                                      |
| label           | string | Name of the Purple Air Sensor                         |
| Latitude        | number | Latitude of the Purple Air Sensor                     |
| Longitude       | number | Longitude of the Purple Air Sensor                    |
| aqi             | string | AQI number                                            |
| aqidescription  | string | A short description of the provided AQI               |
| aqimessage      | string | What the provided AQI means (a longer description)    |
|-----------------|--------|-------------------------------------------------------|



## Full Example

_Provide a full usage example based on textual configuration files (*.things, *.items, *.sitemap)._

## Any custom content here!

_Feel free to add additional sections for whatever you think should also be mentioned about your binding!_
