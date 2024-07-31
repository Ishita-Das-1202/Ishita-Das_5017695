package com.taskmanagement;

class TaskNode {
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList {
    private TaskNode head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add a task
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(String taskId) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    // Traverse and display tasks
    public void traverseTasks() {
        TaskNode temp = head;
        while (temp != null) {
            System.out.println(temp.task.getTaskId() + ": " + temp.task.getTaskName() + " (" + temp.task.getStatus() + ")");
            temp = temp.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTask(String taskId) {
        if (head == null) {
            return false;
        }
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return true;
        }
        TaskNode temp = head;
        while (temp.next != null) {
            if (temp.next.task.getTaskId().equals(taskId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
