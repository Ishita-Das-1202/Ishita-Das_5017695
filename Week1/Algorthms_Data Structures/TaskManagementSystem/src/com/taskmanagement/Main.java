package com.taskmanagement;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task("T001", "Design the system", "Pending");
        Task task2 = new Task("T002", "Implement the system", "In Progress");
        Task task3 = new Task("T003", "Test the system", "Pending");

        // Add tasks
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Traverse and display tasks
        System.out.println("Task List:");
        taskList.traverseTasks();

        // Search for a task
        String searchId = "T002";
        Task searchResult = taskList.searchTask(searchId);
        if (searchResult != null) {
            System.out.println("Task found: " + searchResult.getTaskName());
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        String deleteId = "T003";
        boolean deleteResult = taskList.deleteTask(deleteId);
        if (deleteResult) {
            System.out.println("Task deleted: " + deleteId);
        } else {
            System.out.println("Task not found: " + deleteId);
        }

        // Traverse and display tasks after deletion
        System.out.println("Task List after deletion:");
        taskList.traverseTasks();
    }
}
