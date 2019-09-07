class Raindrops {

    def convert(num) {
        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0)
            "PlingPlangPlong"
        else if (num % 3 == 0 && num % 5 == 0)
            "PlingPlang"
        else if (num % 5 == 0 && num % 7 == 0)
            "PlangPlong"
        else if (num % 3 == 0 && num % 7 == 0)
            "PlingPlong"
        else if (num % 3 == 0)
            "Pling"
        else if (num % 5 == 0)
            "Plang"
        else if (num % 7 == 0)
            "Plong"
        else
            num.toString()
    }
}
