# InsurelyCaseStudy

Implementation of a validation engine. 

Introduced 2 interfaces:

- ValidationRule interface
- Validator interface


*ValidationRules* are standalone entities with the responsibility of applying a single piece of validation logic.

*Validators* apply multiple rules in sequence on a given Object and Validation error messages (if any) based on the result.
To avoid code duplication I also introduced an *AbstractValidator* that contains all common logic, effectively making the actual validators thin and concise.

Unit Tests are included for all classes. 
