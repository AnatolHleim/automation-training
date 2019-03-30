package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {


  private ExperimentalTypes type;
  private ClassificationLevel classificationLevel;

  public ExperimentalPlane(Plane plane, ExperimentalTypes type, ClassificationLevel classificationLevel) {
    super(plane);
    this.type = type;
    this.classificationLevel = classificationLevel;
  }

  public ClassificationLevel getClassificationLevel() {
    return classificationLevel;
  }

  public ExperimentalTypes getType() {
    return type;
  }

  public void setClassificationLevel(ClassificationLevel classificationLevel) {
    this.classificationLevel = classificationLevel;
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "ExperimentalPlane{" +
            "type=" + type +
            ", classificationLevel=" + classificationLevel +
            '}';
  }
}
