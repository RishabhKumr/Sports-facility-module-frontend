package com.booking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;

	private int playerId;

	private String fullName;

	private String lastName;

	private String playerDOB;

	private int facilityId;

	private String facilityName;

	private String facilityCategory;

	private String bookingDate;

	private String startTime;

	private String endTime;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, int playerId, String fullName, String lastName, String playerDOB, int facilityId,
			String facilityName, String facilityCategory, String bookingDate, String startTime, String endTime) {
		super();
		this.bookingId = bookingId;
		this.playerId = playerId;
		this.fullName = fullName;
		this.lastName = lastName;
		this.playerDOB = playerDOB;
		this.facilityId = facilityId;
		this.facilityName = facilityName;
		this.facilityCategory = facilityCategory;
		this.bookingDate = bookingDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPlayerDOB() {
		return playerDOB;
	}

	public void setPlayerDOB(String playerDOB) {
		this.playerDOB = playerDOB;
	}

	public int getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getFacilityCategory() {
		return facilityCategory;
	}

	public void setFacilityCategory(String facilityCategory) {
		this.facilityCategory = facilityCategory;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
