# Assignment 19

Create all of these methods as `static` in a single class.

## Part 1

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length.

### Sample Outputs

```
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
deFront("obelisk") → "belisk"
deFront("able") → "able"
deFront("hi") → ""
deFront("") → ""
```

## Part 2

Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the end if the two letters are alphabetical (or equal) and return a string without the substring at the beginning if the two letters are not alphabetical. Otherwise, return the original string unchanged.

### Sample Outputs

```
without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("TuuuTu") → "Tuuu"
without2("OOooOO") → "OOoo"
without2("xx") → ""
without2("x") → "x"
without2("") → ""
```

## Part 3

Given a string that is a sum, return the sum of the two numbers.

Note: the `trim()` method from the `String` class returns a copy of the `String` with leading and trailing whitespace removed. `Integer.parseInt(String s)` will return a copy of the `String` converted to an `int`.

### Sample Outputs

```
sum("10 + 7") → 17
sum("2+1") → 3
sum("10 + -7") → -3
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

