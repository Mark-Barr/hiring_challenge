itsc_hiring_challenge
================

# goal

Thanks for applying for our applications systems analyst/programmer position at UAMS Biomedical Informatics! As part of our interview process, we created an application challenge. Its goal is for you to show us how you use your knowledge and resources to think through a problem. This repository contains all of the information you should need to get started. 

During this challenge, you will need to follow a few steps (specified in the 'getting started' section) to fork a repository, create a couple of simple programs, and answer some questions about what you did. The process shouldn’t take more than an hour or two to do. Remember, we want to see how you work through a problem. This doesn't have to be your magnum opus, or some sort of magical masterpiece. Have fun, and do something interesting! 

Feel free to contact our Technical Lead, Josh Hanna (jhanna[at]uams.edu) or Jiang Bian (jbian[at]uams.edu), one of our faculty, if you have any questions or need guidance.  Also, this is 'open book', as it were.  Feel free to scour the any resources you have available to you, such as stack overflow or the greater internet.

# getting started

1. Fork this repository.  Github has a lot of learning resources if you're not familiar with it; please take advantage of them if you don't already know how to do this.  
2. Write the two applications, reaching out to me as necessary.  
3. Answer the questions in the previous section by editing the readme.  
4. Submit a pull request to this repository whenever you feel confortable with what you've created.

# application 1: simple API application

The first of the two applications you should create is an API which serves the data found in the `data` folder in the repository.  Ideally, you will create an API which can accessed by a remote application that provides access on a semi-atomic level to the synthetic population found within the data files.  That is, your API should not be a single call that serves _everything_ in the files all at once.  Also, you should slurp the files into some permanent data store (like a SQL DB), and serve the information from there rather than directly from the files.

For more information on the dataset, please look [here](https://www.epimodels.org/midas/Rpubsyntdata1.do).  In particular, this is the 2010 Version 1 U.S. synthesized population of Arkansas.

# application 2: simple consumer application

The second application should consume the data provided by the other application, and do something interesting with it.  We'll leave the something up to you, but it could be a simple web application that displays the data in a table, or a force directed graph relating various entities together.  Use your imagination!


# related questions

Finally, I'd like you to answer a few questions.  Edit this readme in your forked repository and put the answers inline below.

1. Why did you chose the technology stack you chose (language, data store, etc)?
2. Did you seriously consider another stack?  If so, roughly how would it have worked?  If not, why not?
3. Suppose for a second the toy application you've built needed to scale up.  What might you change to accommodate a huge influx of users?  What about a significantly larger amount of data?
4. Finally, I'd like to test your Google skills.  What's the idiomatic way to slurp in file contents in Haskell?  What about Golang?


