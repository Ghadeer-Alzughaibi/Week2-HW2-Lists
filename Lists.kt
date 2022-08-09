fun main() {

        // Read-only (immutable)
        val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
        val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
        val color = listOf<String>()

        // Read and Write (mutable)
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")


        // Read-Write (mutable) List - Operations
           println("Read-Write (mutable) List - Operations\n")

        // Add (Element)
           println("Add(Element)")
           println("Before adding: ${numbers}")
           numbers.add("six")
           println("After adding a number: ${numbers}\n")

        // Add (Index, Element)
           println("Add(Index, Element)")
           println("Before adding: ${numbers}")
           numbers.add(6,"seven")
           println("After adding a number: ${numbers}\n")

        // Add All (List)
           println("AddAll(List)")
           println("Before adding: ${numbers}")
           numbers.addAll(weekDays)
           println("After adding: ${numbers}\n")

        // Add All (Index, List)
           println("AddAll(Index, List)")
           println("Before adding: ${numbers}")
           numbers.addAll(7,weekDays)
           println("After adding: ${numbers}\n")

        // Clear
           println("clear()")
           val colors  = mutableListOf("white", "black", "blue")
           println("Before clear: ${colors}")
           colors.clear()
           println("After use clear(): ${colors}\n")

        // Remove
           println("Remove(Element)")
           println("Before remove: ${numbers}")
           numbers.remove("seven")
           println("After use remove(): ${numbers}\n")

        // Remove At
           println("RemoveAt(Index)")
           println("Before removeAt: ${numbers}")
           numbers.removeAt(5)
           println("After use removeAt(): ${numbers}\n")

        // Remove All
           println("RemoveAll(Element)")
           println("Before removeAll: ${numbers}")
           numbers.removeAll(weekDays)
           println("After use removeAll(): ${numbers}")


           println("\n-----------------------------------------------\n")

        // Read-only (immutable) List - Operations
           println("Read-only (immutable) List - operations\n")

        // The size of the list
           println("The size of the list names is: ${names.size}")

        // Contains
           println("Contains(Element)")
           println("Raghad name exists in the list names? ${names.contains("Raghad")}")
           println("Ghadeer name exists in the list names? ${names.contains("Ghadeer")}")

        // Contains All
         println("ContainsAll(Element)")
         println("${names.containsAll(namesAll)}")
         println("${namesAll.containsAll(names)}")

        // get
         println("get(Index)")
         println("${names.get(2)}")

        // indexOf
         println("indexOf(Index)")
         println("The number index for the name Raghad is: ${names.indexOf("Raghad")}")

        // isEmpty
         println("isEmpty()")
         println("Is the list of names empty? ${names.isEmpty()}")
         println("Is the list of color empty? ${color.isEmpty()}")

        // Sublist
         println("subList(from index, to index)")
         println("${names.subList(2,5)}")

    }
