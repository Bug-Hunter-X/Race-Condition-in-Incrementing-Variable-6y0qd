# Race Condition in Java

This repository demonstrates a simple race condition in Java that can lead to unexpected results when multiple threads access and modify a shared variable concurrently.

The `Bug.java` file contains the buggy code, where the `incrementX()` method is not synchronized.  The `BugSolution.java` file shows a corrected version using appropriate synchronization mechanisms.