
**Password Generator Specification Document**

For this lab course I’m going to make password generator program.

Password shall be generated in following manner:

1. Concatenate MAC address and salt strings.
2. Calculate MD5/SHA1 hash of the concatenated string.
3. Base64 encode the MD5/SHA1 hash and return this Base64 encoded string to user.

For this program I’m going to implement MD5, SHA1 and Base64 algorithms. I think these algorithms will solve the problem and they are simple enough for the scope of this course. I can also compare the speed performance of MD5 and SHA1.

Input for the program will be MAC address as string. It will be used as described above.

Goal for the time- and space complexity of these algrithms is O(n).


Sources:https://searchsecurity.techtarget.com/definition/MD5
	https://en.wikipedia.org/wiki/SHA-1
	https://en.wikipedia.org/wiki/Base64
