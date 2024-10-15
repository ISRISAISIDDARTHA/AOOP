import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Task {
    void execute();
}

class DataProcessingTask implements Task {
    private final String data;
    public DataProcessingTask(String data) { this.data = data; }
    @Override
    public void execute() { System.out.println("Processing data: " + data); }
}

class ApprovalTask implements Task {
    private final String approver;
    public ApprovalTask(String approver) { this.approver = approver; }
    @Override
    public void execute() { System.out.println("Approval required from: " + approver); }
}

class Workflow implements Iterable<Task> {
    private final List<Task> tasks = new ArrayList<>();
    public void addTask(Task task) { tasks.add(task); }
    @Override
    public Iterator<Task> iterator() { return tasks.iterator(); }
    public void execute() { for (Task task : tasks) { task.execute(); } }
}

 class WorkflowManagementSystem {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.addTask(new DataProcessingTask("Customer Data"));
        workflow.addTask(new ApprovalTask("Manager"));
        workflow.execute();
    }
}
