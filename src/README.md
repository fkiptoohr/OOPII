Swing is not thread-safe, meaning that Swing components should be accessed and modified on a single, dedicated thread called the Event Dispatch Thread (EDT). If you attempt to modify Swing components from multiple threads simultaneously, you can run into synchronization issues and unexpected behavior.

`SwingUtilities.invokeLater` is a utility method in the Swing framework that allows you to safely execute a block of code on the EDT. Here's why it's important:

1. **Thread Safety**: Swing components are not inherently thread-safe. They are designed to be accessed, modified, and queried only on the EDT. If you try to modify Swing components from a different thread, you may encounter race conditions and other concurrency issues.

2. **Avoiding UI Freezing**: In GUI applications, especially Swing applications, if time-consuming tasks are performed on the EDT, the UI becomes unresponsive during that time. By using `invokeLater`, you can offload time-consuming tasks to background threads while ensuring that UI updates and modifications are done on the EDT, keeping the application responsive.

3. **Consistent Behavior**: Ensuring that all modifications to the UI are done on the EDT helps maintain consistent and predictable behavior of your Swing application. If you were to modify components from other threads, it could lead to unpredictable results and difficult-to-debug issues.

Here's a breakdown of how `invokeLater` works:

- When `invokeLater` is called, it places the specified code (Runnable) at the end of the EDT event queue.
- The EDT dequeues and executes tasks one by one, in a sequential manner.
- This ensures that any code placed inside `invokeLater` will be executed on the EDT, preventing concurrency issues.

In summary, `SwingUtilities.invokeLater` is a key tool for ensuring the proper functioning of Swing applications by facilitating safe modification of Swing components on the Event Dispatch Thread.

## Anonymous class listener
In Java, anonymous listeners refer to the use of anonymous inner classes to implement listener interfaces or classes without explicitly defining a named class. Listeners are commonly used in graphical user interface (GUI) programming to handle events triggered by user actions such as button clicks or mouse movements.

Anonymous listeners are a concise way to define event-handling logic without the need to create a separate class for each listener. They are often used for short, one-time implementations of listener interfaces. However, for more complex or reusable logic, it might be preferable to use a named class or a lambda expression (introduced in Java 8) for brevity.

Before Java 8, it’s very common that an anonymous class is used to handle click event of a JButton, as shown in the
following code. This example shows how to implement an anonymous listener within the scope of
`btn.addActionListener`.
 ### Code snippet
```agsl
JButton btn = new JButton("My Button");
btn.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 System.out.println("Button was pressed");
 }
});
```


