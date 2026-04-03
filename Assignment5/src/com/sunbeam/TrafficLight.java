package com.sunbeam;

public enum TrafficLight {
	RED(30), GREEN(45), YELLOW(5);

	private final int duration;

	TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

}

class TrafficLightTest {
	public static void main(String[] args) {
		System.out.println("Traffic Light Durations:");
		System.out.println("-----------------------");

		for (TrafficLight light : TrafficLight.values()) {
			System.out.println(light + " light stays for " + light.getDuration() + " seconds.");
		}
	}
}
