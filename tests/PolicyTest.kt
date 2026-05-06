fun main() {
    val signalcase_1 = Signal(74, 95, 8, 5, 5)
    check(Policy.score(signalcase_1) == 222)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(68, 91, 18, 14, 8)
    check(Policy.score(signalcase_2) == 147)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(98, 81, 16, 13, 4)
    check(Policy.score(signalcase_3) == 187)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(42, 39, 11, 75)
    check(DomainReviewLens.score(domainReview) == 165)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
