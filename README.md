# Groovy Map 'each' Method Unexpected Behavior During Modification

This repository demonstrates an uncommon bug in Groovy related to the `each` method when used with Maps.  If you modify the map during iteration, unexpected exceptions or incorrect behavior can result.

The `bug.groovy` file shows the problem. The `bugSolution.groovy` file provides a workaround using `eachWithIndex` to prevent these issues.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the unexpected behavior (potential exceptions or missing entries).
4. Then run `bugSolution.groovy` to see the resolved version.