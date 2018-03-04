package permutation;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Permutation15 extends Permutation {
    // https://stackoverflow.com/questions/11915026/permutations-of-a-string-using-iteration
    public List<String> permutations(String string) {
        List<String> permutations = new LinkedList<>();
        Deque<WorkUnit> workQueue = new LinkedList<>();

        // We need to permutate the whole string and haven't done anything yet.
        workQueue.add(new WorkUnit(string, ""));

        while (!workQueue.isEmpty()) { // Do we still have any work?
            WorkUnit work = workQueue.poll();

            // Permutate each character.
            for (int i = 0; i < work.todo.length(); i++) {
                String permutation = work.done + work.todo.charAt(i);

                // Did we already build a complete permutation?
                if (permutation.length() == string.length()) {
                    permutations.add(permutation);
                } else {

                    // Otherwise what characters are left?
                    String stillTodo = work.todo.substring(0, i) + work.todo.substring(i + 1);
                    workQueue.add(new WorkUnit(stillTodo, permutation));
                }
            }
        }
        return permutations;
    }

    /**
     * Immutable unit of work
     */
    class WorkUnit {
        final String todo;
        final String done;

        WorkUnit(String todo, String done) {
            this.todo = todo;
            this.done = done;
        }
    }

    @Override
    public void run(String testStr) {
        for (String s : permutations(testStr))
            System.out.println(s);
    }
}
