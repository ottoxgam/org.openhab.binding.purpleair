# purpleair Binding

Binding for PurpleAir Sensors. This binding links to the purpleair thingspeak api to pull data.

## Supported Things

Purpleair Sensor


## Binding Configuration

## Thing Configuration
Station ID:
You’ll need you the ID of your station from https://www.purpleair.com/json. First, head to https://www.purpleair.com/map?opt=1 and find your station. When you click on it, it'll show your station name. Use that to search on the /json page to find your station ID.

Refresh Interval:
Refresh Interval of the binding listed in seconds.

## Channels


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




## Full Example

_Provide a full usage example based on textual configuration files (*.things, *.items, *.sitemap)._

## Any custom content here!

_Feel free to add additional sections for whatever you think should also be mentioned about your binding!_
