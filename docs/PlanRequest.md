

# PlanRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Integer** | The amount in cents that will be charged on the interval specified. | 
**currency** | **String** | ISO 4217 for currencies, for the Mexican peso it is MXN/USD |  [optional]
**expiryCount** | **Integer** | Number of repetitions of the frequency NUMBER OF CHARGES TO BE MADE, considering the interval and frequency, this evolves over time, but is subject to the expiration count. |  [optional]
**frequency** | **Integer** | Frequency of the charge, which together with the interval, can be every 3 weeks, every 4 months, every 2 years, every 5 fortnights | 
**id** | **String** | internal reference id |  [optional]
**interval** | [**IntervalEnum**](#IntervalEnum) | The interval of time between each charge. | 
**name** | **String** | The name of the plan. | 
**trialPeriodDays** | **Integer** | The number of days the customer will have a free trial. |  [optional]


## Enum: IntervalEnum

Name | Value
---- | -----




