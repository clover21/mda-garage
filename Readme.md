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

## How to generate code from UML by Claire Romanel

I couldn't find a simple way to generate code from plantUML files. 
Therefore, I used Visual Paradigm instead, because I used it before to generate UML from code and I knew it could do the reverse operation (I do UML after coding and only because I have to, but I hate it, so I code first).

I first used the classes we already created to generate a class diagram in VP. 
Then, I added some operations on the class diagram. 
In the end, I used the VP "Generate Java Code" functionality to reverse back the UML to code. 
Operations that were added to the classes in the diagram were added into the code after that.

This shows that, if we want, we can begin a project directly on tools like VP, and later generate some code from it.
Like I said, I usually do the opposite, because I think coding is fun, while making diagrams is f*****g (censored) boring.
