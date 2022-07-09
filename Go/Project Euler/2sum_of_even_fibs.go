package main

import "fmt"

func main() {
	var temp int
	var result int
	threshold := 4000000
	fibs := []int{1, 2}

	for i := 2; fibs[i-2] < threshold; i++ {
		temp = fibs[i-1] + fibs[i-2]
		fibs = append(fibs, temp)
	}

	for j := 0; j < len(fibs); j++ {
		if fibs[j]%2 == 0 {
			result += fibs[j]
		} else {
			continue
		}
	}

	fmt.Println(result)
}
