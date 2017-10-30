package java112.demos;

/**
 * This class represents a student in the demo of maps with objects.
 * Also used to demonstrate the comparable interface.
 *
 * @author pwaite
 */
public class Student implements Comparable<Student> {
     private String firstName;
     private String lastName;
     private String grade;
     private int id;

	/**
	 * Instantiates a new Student.
	 */
	public Student() {
	}

	/**
	 * Instantiates a new Student.
	 *
	 * @param firstName the first name
	 * @param lastName  the last name
	 * @param grade     the grade
	 * @param id        the id
	 */
	public Student(String firstName, String lastName, String grade, int id) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.id = id;
	}

	/**
	 * Gets first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets first name.
	 *
	 * @param firstName the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets last name.
	 *
	 * @param lastName the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets grade.
	 *
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Sets grade.
	 *
	 * @param grade the grade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", grade='" + grade + '\'' +
				", id=" + id +
				'}';
	}

	/**
      *  Compare students - based on id
      *  @param thatStudent to compare
      */
     public int compareTo(Student thatStudent) {
          final int BEFORE = -1;
          final int EQUAL = 0;
          final int AFTER = 1;

          if (this == thatStudent) {
              return EQUAL;
          }
          else if (this.id < thatStudent.id) {
              return BEFORE;
          }
          else if (this.id > thatStudent.id) {
              return AFTER;
          }
          else {
              return EQUAL;
          }
      }





 }
