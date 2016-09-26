# Your Future Customers Application Summary
This is an application made by Team Tolmachoff for
the Plano Academy High School 4th years' SouthWest
Airlines [SWA] project, where we emulated the 
business development department. The timeframe was 
September-October 2016. The language used was Java.

#Purpose
We were tasked with creating a program that could log
the amount of time we worked on our SWA project. It was
also to be capable of creating billing statements and 
reports for project purposes, to share at the final 
presentation.

#Algorithm for Mrs. Bolton
Program purpose: To track the amount of time an individual is working on the project, how much 
Program is launched (process is started. Run it as a .jar, or maybe use a jar bundler or something to make it run as a native .app if OSX is being used). This will be in a window with one input area. Note: Any windows mentioned will be created with the AWT API (for future reference).

Asks for user alias (Note: thing stored in any form in secondary memory will likely be created and accessed by buffered I/O or a sufficient alternative. I/O as in java.nio.file, applies for future reference too)
User enters string in input area, entitled username.

Program checks if username is valid. If username is not valid, return to login area
If username is valid (username exists in .txt file or .csv file or something), change the single input line’s name to “password.” There will be a “password” (another string, existing in the same manner as the username) the user needs to type in to not get sent back to the login screen again. If the “password” is invalid, they need to be sent back to the login screen.

If the password is valid and matches up with the username, then close the current window (or just change the current window to make it match the following description) and launch a new window, the “new session.”
New session begins, timing starts (via finding the system time and recording it on a file on secondary memory specific to the user that initiated the session).

The “new session” will be represented by a window with 3 areas. Assignments/completion level, billing statements, and reports (sections may be subject to name change at any time depending on level of need).

All 3 of those things will have their own file for storage in secondary memory, and will be accessed by I/O.
User modifies assignments/completion level files/billing statements/reports by clicking and/or typing in the window via provided buttons or text boxes. Said modifications are saved via the aforementioned method.

Possible implementation of a matrix for assignments/completion level. That is in main memory, so it will be erased upon the process’s end, but values can be read from a file in secondary memory.

User always has option to “log off” (stop the current “session” and timelogging by returning to the “login” screen and saving the final time in the timelog), end.

Process can be ended if needed by pressing a button ending a loop in main

Note: GUI would happen either Java with the Abstract Window Toolkit (AWT). Swing API added on in dependencies as of 9/25/16.
Task designation: 
Luke: Implementation of AWT API and I/O file system framework
Mira: Window Design Login Screen Application Interface, change code to match accordingly in AWT API implementation where necessary once successfully implemented
Jourdan: Design and potentially implement matrix for the assignment/completion level tool (think of it as a table, columns are labeled with the assignment name, the rows are labeled with completion status, individual cells are), Billing statement recording ability (keep billing statements in a list)
JJ: Create report composition section (typing documents, essentially. Save strings to a .txt file able to be read in the program).


Note 2: Here is a link to the algorithm in Google Docs, which is in a much nicer format. https://docs.google.com/document/d/1RnmfUtAoPlweS3FmsAEEDmR0CtkYl0GjkFXQgmofbLU/edit?usp=sharing
