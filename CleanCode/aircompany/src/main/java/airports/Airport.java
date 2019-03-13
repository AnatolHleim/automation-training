package airports;

import models.MilitaryType;
import planes.ExperimentalPlane;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
  private List<Plane> planes;


  private List<PassengerPlane> getPassengerPlanes() {
    List<? extends Plane> l = this.planes;
    List<PassengerPlane> x = new ArrayList<>();
    for (Plane p : l) {
      if (p instanceof PassengerPlane) {
        x.add((PassengerPlane) p);
      }
    }
    return x;
  }

  private List<MilitaryPlane> getMilitaryPlanes() {
    List<MilitaryPlane> militaryPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof MilitaryPlane) {
        militaryPlanes.add((MilitaryPlane) plane);
      }
    }
    return militaryPlanes;
  }

  public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
    List<PassengerPlane> passengerPlanes = getPassengerPlanes();
    PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
    for (PassengerPlane passengerPlane : passengerPlanes) {
      if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
        planeWithMaxCapacity = passengerPlane;
      }
    }
    return planeWithMaxCapacity;
  }

  public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (MilitaryPlane plane : militaryPlanes) {
      if (plane.getType() == MilitaryType.TRANSPORT) {
        transportMilitaryPlanes.add(plane);
      }
    }
    return transportMilitaryPlanes;
  }

  public List<MilitaryPlane> getBomberMilitaryPlanes() {
    List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (MilitaryPlane plane : militaryPlanes) {
      if (plane.getType() == MilitaryType.BOMBER) {
        bomberMilitaryPlanes.add(plane);
      }
    }
    return bomberMilitaryPlanes;

  }

  public List<ExperimentalPlane> getExperimentalPlanes() {
    List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
    for (Plane plane : planes) {
      if (plane instanceof ExperimentalPlane) {
        experimentalPlanes.add((ExperimentalPlane) plane);
      }
    }
    return experimentalPlanes;
  }

  public Airport sortByMaxDistance() {
    planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
    return this;
  }


  /**
   * Sorts by max speed
   *
   * @return airports.Airport
   */
  public Airport sortByMaxSpeed() {
    planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
    return this;
  }

  public void sortByMaxLoadCapacity() {
    planes.sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
  }

  public List<Plane> getPlanes() {
    return planes;
  }


  @Override
  public String toString() {
    return "airports.Airport{" +
            "planes=" + planes.toString() +
            '}';
  }

  public Airport(List<Plane> planes) {
    this.planes = planes;
  }

}
