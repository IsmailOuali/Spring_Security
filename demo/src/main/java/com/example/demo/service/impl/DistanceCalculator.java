package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

@Service
public class DistanceCalculator {

    private static final double EARTH_RADIUS_KM = 6371.0;

    /**
     * Calculate the distance between two GPS coordinates.
     *
     * @param startLat Latitude of the starting point in decimal degrees
     * @param startLon Longitude of the starting point in decimal degrees
     * @param endLat Latitude of the ending point in decimal degrees
     * @param endLon Longitude of the ending point in decimal degrees
     * @return The distance in kilometers
     */
    public static double calculateDistance(double startLat, double startLon, double endLat, double endLon) {
            // Convert latitude and longitude from degrees to
        double lat1 = Math.toRadians(startLat);
        double lon1 = Math.toRadians(startLon);
        double lat2 = Math.toRadians(endLat);
        double lon2 = Math.toRadians(endLon);

        // Compute the differences between the points
        double deltaLat = lat2 - lat1;
        double deltaLon = lon2 - lon1;

        // Apply the Haversine formula
        double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance
        return EARTH_RADIUS_KM * c;
    }

    public static void main(String[] args) {
        // Example coordinates
        double startLat = 48.8566; // Latitude of Paris
        double startLon = 2.3522;  // Longitude of Paris
        double endLat = 51.5074;   // Latitude of London
        double endLon = -0.1278;   // Longitude of London

        double distance = calculateDistance(startLat, startLon, endLat, endLon);
        System.out.printf("Distance: %.2f km%n", distance);
    }
}

