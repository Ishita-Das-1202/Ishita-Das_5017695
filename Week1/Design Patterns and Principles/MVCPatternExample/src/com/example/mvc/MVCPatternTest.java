package com.example.mvc;

public class MVCPatternTest {

    public static void main(String[] args) {
        // Create the model
        Student model = new Student("John Doe", "12345", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(model, view);

        // Update view
        controller.updateView();

        // Change student details
        controller.setStudentName("Jane Smith");
        controller.setStudentId("54321");
        controller.setStudentGrade("B");

        // Update view
        controller.updateView();
    }
}
