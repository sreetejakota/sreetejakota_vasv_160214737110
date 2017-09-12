import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	

	@Override
	public Student[] getStudents() {
        return this.students;       
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null){
			throw new IllegalArgumentException();
		}
		else
			this.students=students;
		
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index>=this.students.length) {
            throw new IllegalArgumentException();
        }
        else {
             return this.students[index];
        }
		// Add your implementation here
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length || student == null) {
             throw new IllegalArgumentException();
        }
         else {
              this.students[index]=student;
        }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == null) {
             throw new IllegalArgumentException();
        }
        else {
             Student[] std= new Student[this.students.length+1];
              std[0]=student;
              int j=0;
                for(int i=1;i<=this.students.length;i++) {
              std[i]=this.students[j];
              j++;
         }
          this.students = new Student[std.length];
         this.students = std;
     }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null) {
                throw new IllegalArgumentException();
        }
         else {
              Student[] students1= new Student[this.students.length+1];
              students1[this.students.length-1]=student;

              students1[this.students.length]=this.students[this.students.length-1];
                 students1[this.students.length+1]= this.students[this.students.length];
              this.students = new Student[students1.length];
              this.students = students1;
        }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length || student == null) {
                throw new IllegalArgumentException();
         }
         else {
                  Student[] students1= new Student[this.students.length+1];
                 students1[index]=student;
                for(int i=index;i<this.students.length;i++) {
                   students1[i+1]=this.students[i];
                 }
                 this.students = new Student[students1.length];
                this.students = students1;
        }
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length) {
             throw new IllegalArgumentException();
        }
        else {
               Student[] students1= new Student[this.students.length-1];
               students1=this.students;
               for(int i=index;i<this.students.length;i++) {
                        students1[i]=this.students[i+1];
               }
              this.students = new Student[students1.length];
             this.students = students1;
        }
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
