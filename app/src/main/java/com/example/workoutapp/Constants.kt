package com.example.workoutapp

object Constants {

/*
 * List of the exercises as constants so that they can have their id, name, and src pulled in order
 * Creates an array list for the models
*/

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val pushUps = ExerciseModel(
            1,
            "Push Ups",
            R.drawable.push_ups,
            false,
            false
        )
        exerciseList.add(pushUps)

        val boxJumps = ExerciseModel(
            2,
            "Box Jumps",
            R.drawable.box_jumps,
            false,
            false
        )
        exerciseList.add(boxJumps)

        val jumpingJacks = ExerciseModel(
            3,
            "Jumping Jacks",
            R.drawable.jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val lunges = ExerciseModel(
            4,
            "Lunges",
            R.drawable.lunges,
            false,
            false
        )
        exerciseList.add(lunges)

        val planks = ExerciseModel(
            5,
            "Planks",
            R.drawable.planks,
            false,
            false
        )
        exerciseList.add(planks)

        val sidePlanks = ExerciseModel(
            6,
            "Side Planks",
            R.drawable.side_planks,
            false,
            false
        )
        exerciseList.add(sidePlanks)

        val squats = ExerciseModel(
            7,
            "Squats",
            R.drawable.squats,
            false,
            false
        )
        exerciseList.add(squats)

        val wallSitting = ExerciseModel(
            8,
            "Wall Sitting",
            R.drawable.wall_sitting,
            false,
            false
        )
        exerciseList.add(wallSitting)

        return exerciseList
    }
}