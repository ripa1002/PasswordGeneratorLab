<h1>Implementation document</h1>

## Structure

This Java project consists of 6 classes, divided into 2 packages. First package contains classes for implementing MD5, SHA-1 and Base64 algorithms and second one contains I/O controller, UI and main class.

## Time/Space complexities

Time complexity of all the algorithms (MD5, SHA-1 and Base64) is O(n). The MD5 produces 128-bit (32 chars) long hash from input string and SHA-1 produces 160-bit (40 chars) long hash. On top of that, encoding the hash with Base64 adds 35% increase to the hash, which makes 44 chars in case of MD5 and 56 chars in case of SHA-1.

## Comparative analysis

Comparative testing of MD5 and SHA-1 algos. Look testing documentation for results.

## Flaws and improvements

Salt string that is concatenated with user provided MAC-address is hardcoded. Also, the hash()-method of MD5 and SHA-1 classes is quite big and could be divided into smaller parts.

## Sources

https://en.wikipedia.org/wiki/MD5
https://en.wikipedia.org/wiki/SHA-1
https://en.wikipedia.org/wiki/Base64
https://searchsecurity.techtarget.com/definition/MD5
https://www.miraclesalad.com/webtools/md5.php
https://www.miraclesalad.com/webtools/sha1.php



