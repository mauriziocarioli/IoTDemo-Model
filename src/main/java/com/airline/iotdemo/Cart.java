package com.airline.iotdemo;

import org.kie.api.definition.type.Label;
import org.kie.api.definition.type.Description;

import java.io.Serializable;
import java.util.List;

/**
 * This class was automatically generated by the data modeler tool.
 */

@Label("FOODTRUCK")
@Description("A Food Truck")
public class Cart implements Serializable {

	static final long serialVersionUID = 1L;

	@Label("TRUCK ID")
	@Description("Truck ID")
	private String id;

	@Description("Current Date")
	@Label("CURRENTDATE")
	private Long timestamp;

	@Label("LOCLATITUDE")
	@Description("Geolocation Latitude")
	private Double latitude;

	@Label("LOCLONGITUDE")
	@Description("Geolocation Longitude")
	private Double longitude;

	@Label("TEMPSENSORVALUE")
	@Description("Temperature Sensor Value")
	private Double temperature;

	@Label("RFID")
	@Description("Food Container RFID")
	private String foodId;

	@Description("Truck Activity")
	@Label("ACTIVITY")
	private String activity;

	@Label(value = "ALERT_DETAILS")
	private List<Alert> alerts;
	
	@Label(value = "RULESTRIGGERED")
	private String rulesFired;

	public Cart() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getFoodId() {
		return this.foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public List<Alert> getAlerts() {
		return this.alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}
	
	public String getRulesFired() {
	    return this.rulesFired;
	}
	
	public void setRulesFired(String rulesFired) {
	    this.rulesFired = rulesFired;
	}

	public Cart(String id, Long timestamp,
			Double latitude, Double longitude,
			Double temperature, String foodId,
			Integer status, String activity,
			List<Alert> alerts, String rulesFired) {
		this.id = id;
		this.timestamp = timestamp;
		this.latitude = latitude;
		this.longitude = longitude;
		this.temperature = temperature;
		this.foodId = foodId;
		this.activity = activity;
		this.alerts = alerts;
	}

}
