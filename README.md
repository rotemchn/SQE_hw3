# SQE_hw3

# Assignment 3: Software Quality Engineering
This is a repository for assignment 3 of the Software Quality Engineering course at the [Ben-Gurion University](https://in.bgu.ac.il/), Israel.

## Assignment Description
In this assignment, we tested an open-source software called SimplCommerce (https://www.simplcommerce.com/).

A simple, cross platform, modularized ecommerce system built on .NET Core.

## Installation

## Visual Studio 2022 and SQL Server

#### Prerequisites

- SQL Server
- Visual Studio 2022

#### Steps to run

- Update the connection string in appsettings.json in SimplCommerce.WebHost
- Build the whole solution.
- In Solution Explorer, make sure that SimplCommerce.WebHost is selected as the Startup Project
- Open the Package Manager Console Window and make sure that SimplCommerce.WebHost is selected as the Default project. Then type "Update-Database" then press "Enter". This action will create the database schema.
- In Visual Studio, press "Control + F5".
- The back-office can be accessed via /Admin using the following built-in account: admin@simplcommerce.com, 1qazZAQ!

## Mac/Linux with PostgreSQL

#### Prerequisite

- PostgreSQL
- [.NET Core SDK 6.0](https://www.microsoft.com/net/download/all)
- Entity Framework Core (`dotnet tool install --global dotnet-ef`)

#### Steps to run

- Update the connection string in appsettings.json in SimplCommerce.WebHost.
- Run the simpl-build.sh file by issuing the following command: "sudo ./simpl-build.sh". For ubuntu 18: "sudo bash simpl-build.sh"
- In the terminal, navigate to "src/SimplCommerce.WebHost" and type "dotnet run" and then hit "Enter".
- Open http://localhost:5000 in the browser. The back-office can be accessed via /Admin using the following built-in account: admin@simplcommerce.com, 1qazZAQ!


## What we tested

We tested the cart module, in which a client can add products to his cart, see their prices, and purchase them.

We chose to test the following user stories: 

*User story:* A client adds a review to a product.

*Preconditions:* There is a store with a product.

*Expected outcome:*  The a review is added to the product.

*User story:* A seller deletes the product.

*Preconditions:* There is a store with a product, and the seller has permission to delete the product.

*Expected outcome:*  The product was deleted.


## How we tested
We used two different testing methods:
1. [Cucumber](https://cucumber.io/), a BDD testing framework.
2. [Provengo](https://provengo.tech/), a story-based testing framework.

Each of the testing methods is elaborated in its own directory. 

## Results
Update all README.md files (except for d-e, see Section 1). Specifically, replace all $$*TODO*…$$ according to the instructions inside the $$.

## Detected Bugs
We detected the following bugs:

1. Bug 1: 
   1. General description: ...
   2. Steps to reproduce: ...
   3. Expected result: ...
   4. Actual result: ...
   5. Link to the bug report: (you are encouraged to report the bug to the developers of the software)
2. Bug 2: ...

$$*TODO* if you did not detect the bug, you can delete this section$$  
