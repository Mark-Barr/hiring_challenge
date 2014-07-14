itsc_hiring_challange
================

This repository contains all of the information you should need to get started on our hiring challange.

# goal

The goal of this challenge to create two simple applications.  We're trying to make it so these don't take more than an hour or two (an afternoon, max), depending on your experience and how far you're willing to take it.  

We're purposely keeping the specification simple and open, giving you the ability to demonstrate how you think through a problem.

# simple api application

The first of the two applications you should create is an api which serves the data found in the `data` folder in the repository.  Ideally, you will create an api which can accessed by a remote application that provides access on a semi-atomic level to the synthetic population found within the data files.  You should slurp the files into some permanent data store (like a SQL DB), and serve the information from there rather than directly from the files.

For more information on the dataset, please look [here](https://www.epimodels.org/midas/Rpubsyntdata1.do).  In particular, this is the 2010 Version 1 U.S. synthesized population of Arkansas.

# simple consumer application

The second application should consume the data provided by the other application, and do something interesting with it.  We'll leave the something up to you, but it could be a simple web application that displays the data in a table, or a force directed graph relating various entities together.  Use your imagination!

# need help?

Feel free to contact myself (jhanna[at]uams.edu) if you have any questions or need some guidance on what you should be doing.

# related questions

Additonally, I'd like you to answer a few questions.

1. Why did you chose the technology stack you chose (language, data store, etc)?
2. Did you seriously consider another stack?  If so, roughly how would it have worked?  If not, why not?
3. Suppose for a second the toy application you've built needed to scale up.  What might you change to accommodate a huge influx of users?  What about a significantly larger amount of data?
4. Finally, I'd like to test your Google skills.  What's the idiomatic way to slurp in file contents in Haskell?  What about Golang?

# getting started

First, fork this repository.  Github has a lot of learning resources if you're not familiar with it; please take advantage of them if you don't already know how to do this.  Second, write the two applications, reaching out to me as necessary.  Third, answer the questions in the previous section by editing the readme.  Fourth, submit a pull request to this repository whenever you feel confortable with what you've created.

Remember, we're looking to find out how you work through a problem.  This doesn't have to be your magnum opus, or some sort of magical masterpiece.  Have fun, and do something interesting!
