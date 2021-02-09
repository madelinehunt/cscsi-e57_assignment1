Assignment 1

CSCI E-57

Nathan Hunt

04 October 2020

---

## How to Execute

Each sub-assignment has had a fresh `mvn clean install` run before submission. 

### Assignment 1.1

This application is in the directory `1_1`. This can be run with `java -jar target/assignment1_1.jar` from inside that directory. Output will appear like this:

```
2020-10-04 20:34:29,341 INFO [cscie57.assignment1_1.Category] - <======================Books Set Output Start ======================>
2020-10-04 20:34:29,356 INFO [cscie57.assignment1_1.Category] - <Category -- Id: 2 Name: Novels, Books Set: [Book - : 1, ISBN: 123456789, Title: Crime and Punishment, Price: 28.45, Book - : 2, ISBN: 1232256789, Title: Mysery, Price: 24.95]>
2020-10-04 20:34:29,356 INFO [cscie57.assignment1_1.Category] - <======================Books Set Output End ======================>
2020-10-04 20:34:29,356 INFO [cscie57.assignment1_1.Category] - <======================Books Set Output Start ======================>
2020-10-04 20:34:29,356 INFO [cscie57.assignment1_1.Category] - <Category -- Id: 3 Name: Java, Books List: [Book - : 10, ISBN: 987456789, Title: Core Java, Price: 34.99, Book - : 3, ISBN: 553225678, Title: Java in a Nutshell, Price: 20.35]>
2020-10-04 20:34:29,356 INFO [cscie57.assignment1_1.Category] - <======================Books Set Output End ======================>
2020-10-04 20:34:29,356 INFO [cscie57.assignment1_1.Category] - <======================Books Set Output Start ======================>
2020-10-04 20:34:29,357 INFO [cscie57.assignment1_1.Category] - <Category -- Id: 4 Name: Poetry, Books Map: {key1=Book - : 11, ISBN: 367456789, Title: Shakespeare Poetry, Price: 24.25, key2=Book - : 4, ISBN: 043225678, Title: Pushkin Poetry, Price: 27.95}>
2020-10-04 20:34:29,357 INFO [cscie57.assignment1_1.Category] - <======================Books Set Output End ======================>
```

### Assignment 1.2 

I followed the advice of the assignement PDF, and developed separate applications for each implementation. 

##### byName

This application is in the directory `1_2/byName`. This can be run with `java -jar target/assignment1_2.jar` from inside that directory. Output will appear like this: 

```
2020-10-04 20:36:40,254 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredByName Output Start ======================>
2020-10-04 20:36:40,267 INFO [cscie57.assignment1_2.Category] - <Autowiring byName: book = Book - Id: 16, ISBN: 214745678, Title: Shakespeare Poetry, Price: 36.59>
2020-10-04 20:36:40,267 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredByName Output End ======================>
```

##### byType

This application is in the directory `1_2/byType`. This can be run with `java -jar target/assignment1_2.jar` from inside that directory. Output will appear like this: 

```
2020-10-04 20:37:17,192 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredByType Output Start ======================>
2020-10-04 20:37:17,206 INFO [cscie57.assignment1_2.Category] - <Autowiring byType: book = Book - Id: 14, ISBN: 214745678, Title: Frost Poetry, Price: 22.19>
2020-10-04 20:37:17,206 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredByType Output End ======================>
```

##### byConstructor

This application is in the directory `1_2/byType`. This can be run with `java -jar target/assignment1_2.jar` from inside that directory. Output will appear like this: 

```
2020-10-04 20:38:02,553 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredByConstructor Output Start ======================>
2020-10-04 20:38:02,567 INFO [cscie57.assignment1_2.Category] - <Autowiring byConstructor: book = Book - Id: 17, ISBN: 2147451111, Title: Pushkin Poetry, Price: 42.19>
2020-10-04 20:38:02,567 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredByConstructor Output End ======================>

```

##### bySetter 

This application is in the directory `1_2/byType`. This can be run with `java -jar target/assignment1_2.jar` from inside that directory. Output will appear like this: 

```
2020-10-04 20:38:25,529 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredBySetter Output Start ======================>
2020-10-04 20:38:25,543 INFO [cscie57.assignment1_2.Category] - <Autowiring bySetter: book = Book - Id: 15, ISBN: 214745666, Title: Whitman Poetry, Price: 26.59>
2020-10-04 20:38:25,543 INFO [cscie57.assignment1_2.Category] - <======================bookAutowiredBySetter Output End ======================>

```

### Assignment 1.3

I kept all main classes in the same implementation, as suggested in the assignment PDF. All main classes are in the subdirectory `1_3`. 

Please run them with the following commands:

* ` java -jar target/assignment1_3BookBeforeAdvice.jar`
*  `java -jar target/assignment1_3BookAfterReturningAdvice.jar`
*  `java -jar target/assignment1_3BookThrowsAdvice.jar`

