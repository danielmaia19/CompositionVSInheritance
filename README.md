# Composition VS Inheritance

In our recent lecture we looked at the pros and cons of using composition over inheritance.

In this project, I have created simple example of using composition instead of using inheritance.

The example that I created is as follows: 

## Classes
* _Name_: which we can create objects to create first name and last name as well as getting a full name.
* _Person_: allows a _Person_ object to be create with a composition of the _Name_ class which a _Person_ has a _Name_. This is the composition.

## Interfaces
* _Employable_: implies that a person is employable.
* _Roleable_: implies that a person has a role.

__Note__: Employable and Roleable interface could probably be put into 1 interface, however, for the sake of the example I placed them seperatly to see how extending interfaces work.

I have included a DemoApp which you can run to see it working.

Feel free to contribute :smiley:
