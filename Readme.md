# Garage Management Software

## Need

Garage for storing expensive cars, like Porsche, Aston Martin, Lamborghini, etc.

## Actors

- Rentees - people who rented places in garage
- Owner - person who owns the garage

## Features

- Owner - open garage
- Owner - close garage

- Rentee - book place
- Rentee - unbook place
- Rentee - enter garage with a car
- Rentee - exit garage with a car

## Solution

- Backend service with exposed API
- Optional - Frontend App running in a browser

## Ex 1 - How to generate code from UML by Claire Romanel

I couldn't find a simple way to generate code from plantUML files. 
Therefore, I used Visual Paradigm instead, because I used it before to generate UML from code and I knew it could do the reverse operation (I do UML after coding and only because I have to, but I hate it, so I code first).

I first used the classes we already created to generate a class diagram in VP. 
Then, I added some operations on the class diagram. 
In the end, I used the VP "Generate Java Code" functionality to reverse back the UML to code. 
Operations that were added to the classes in the diagram were added into the code after that.

This shows that, if we want, we can begin a project directly on tools like VP, and later generate some code from it.
Like I said, I usually do the opposite, because I think coding is fun, while making diagrams is f*****g (censored) boring.


## Ex 2 - Summary of the articles "AnemicDomainModel" and "Once an anti-pattern: Anemic Domain Model"

The fisrt article is Martin Fowler's opinion on the Anemic Domain Model. He says that it is an anti-pattern and he is concerned that it is being used more and more.

He describes the Anemic Domain Model and says that at first sight it may seem like a good idea, but that it is contrary to the principles of object-oriented programming and looks more like procedural programming.

He says that Anemic Domain Model brings the disadvantages of Domain Model but not the advantages. He thinks that the use of Anemic Domain Model comes from a confusion on the part of people who don't really understand Domain Model.

He recommends using POJOs instead of JEE entities.

The second article is a reaction to the previous one. It was written by Sebastian Gebski and published on the no-kill-switch.ghost.io website.

The author explains in this article why, despite his respect for Martin Fowler, he disagrees with him that the Anemic Domain Model is an anti-pattern and that traditional object-oriented programming is necessary better.

He explains that there is no one way to do things well and that development methods must evolve over time. What was true yesterday is not necessarily true today.

Although traditional object-oriented programming may seem more intuitive, the Anemic Domain Model approach, which is closer to functional programming, is less complex and easier to test. It allows for a greater decoupling of data and business logic and is more suitable for a majority of use cases.

I agree with the author of the second article in the sense that I think that certain principles should not become dogma. Programming is not an exact science and there is not only one way to program an application. A good programmer must have a flexible mind and look for efficiency before respecting rigid principles, while keeping in mind the basic good practices.