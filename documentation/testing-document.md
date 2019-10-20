<h1>Testing document</h1>

## General

There is three different test classes, one for each algorithm class. For MD5 and SHA-1, tests check that they return correct hash. For Base64, encoding is tested.

## Mutation and line coverage

![pit tests image](https://github.com/ripa1002/PasswordGeneratorLab/blob/master/documentation/images/pi_test_1.jpg)

## Comparative tests

I tested execution speed of hash()-function in MD5 and SHA-1 classes. Two different length input strings were used; short input is 17 characters and long is 2412 characters. Both inputs are hashed 1 million times with both algos.
These result values represent average of 3 test runs.

**Results**

![comparative testing image](https://github.com/ripa1002/PasswordGeneratorLab/blob/master/documentation/images/comparative_bars.png)

- Hashing short input 1 million times took 16.827 seconds with MD5 and 15.875 seconds with SHA-1.
- Hashing long input 1 million times took 26.944 seconds with MD5 and 29.467 seconds with SHA-1.

We see that with short input MD5 is about 5.7 % slower than SHA-1 and with long input MD5 is about 8.6 % faster than SHA-1.


