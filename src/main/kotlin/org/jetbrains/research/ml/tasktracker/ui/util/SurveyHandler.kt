package org.jetbrains.research.ml.tasktracker.ui.util

private val factorsList = listOf(
    "self-management to time",
    "self-organization/problem solving",
    "self-restraint",
    "self-motivation",
    "self-regulation of emotion"
)

private const val CONTROL_SUM = 8

fun getSurveyFactors(answers: List<Int>): List<String> {
    val factorsSumList = answers.chunked(4).map { it.sum() } zip factorsList
    return factorsSumList.filter { it.first > CONTROL_SUM }.map { it.second }
}
