Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("Java is a Programming language,It is used for development")
Send("{ENTER}")
Send("Python is a Scripting Language,It is used for development");
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","&Save","Button1")
Sleep(2000)
ControlSetText("Save As","*.txt","ComboBox1","H:\ExampleAutomation\AutoIT\SampleFile.txt")
Sleep(2000)
ControlClick("Save As","&Save","Button2")
Sleep(2000)
ControlClick("Confirm Save As","&Yes","Button1")
Sleep(2000)