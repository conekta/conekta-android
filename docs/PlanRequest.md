
# PlanRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **kotlin.Int** | The amount in cents that will be charged on the interval specified. | 
**frequency** | **kotlin.Int** | Frequency of the charge, which together with the interval, can be every 3 weeks, every 4 months, every 2 years, every 5 fortnights | 
**interval** | [**inline**](#Interval) | The interval of time between each charge. | 
**name** | **kotlin.String** | The name of the plan. | 
**currency** | **kotlin.String** | ISO 4217 for currencies, for the Mexican peso it is MXN/USD |  [optional]
**expiryCount** | **kotlin.Int** | Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count. |  [optional]
**id** | **kotlin.String** | internal reference id |  [optional]
**trialPeriodDays** | **kotlin.Int** | The number of days the customer will have a free trial. |  [optional]


<a id="Interval"></a>
## Enum: interval
Name | Value
---- | -----
interval | week, half_month, month, year



