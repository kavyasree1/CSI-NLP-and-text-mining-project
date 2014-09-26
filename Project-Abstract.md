CSI-NLP-and-text-mining-project
===============================


PROBLEM STATEMENT:

(Application 1)
'Sentiment Analysis' aims at developing a machine learning technique to determine the polarity of a document. The key objective is to design an algorithm that can learn ‘certain’ information from the already classified data set (learning set) and then classify a review as positive or negative.
We attempt to classify various product(a product could be anything-tangible things like different models of phones or services, websites etc- flexible) reviews by using various methods of NLP(Natural Language processing). The aim of the project is to be able to analyze reviews one by one and determine whether the user is positive or negative about the given product.
(Application 2)
'Automative Exam Scoring' is an objective method of marking which involves analysing answers for the presence of concrete facts or statements instead of using any continuous measure. A machine learning approach is adopted using a set of pre-defined keywords, the presence of which helps evaluate an answer.


SCOPE OF THE PROJECT:

The project has a lot of scope for improvement and research. The project can further be extended, if feasible, to compare two products of the same type based solely on user reviews. Emotion detection i.e. measure of the extent of positivity or negativity of the review, can be done in the future as an extension to this project.
There is extensive research going on in the field of 'Automative Exam Scoring' that aims to increase the efficiency of the process while ensuring reliability and accuracy. It focusses on the ability to find parsed keywords to extract the essence of the answer.


CHALLENGES:

1. Sarcastic statements. Eg. The food at xyz was so good that even my dog refused to eat it.
   This review is negative inspite of having positive words like 'good'. Detecting sarcasm is a challenge.
2. Consider this:
   'I have never seen a camera like this'
   It's hard to determine the sentiment of this statement since it doesn't have any clear positive or negative words.
3. 'Cat eats Mouse' will be equivalent to 'Mouse eats Cat'.-
   Thus,we will have to ensure that it takes into account the meaning of the sentence by equating 'Cat eats Mouse' with 'Mouse     is eaten BY Cat'.(For automative scoring)
4.Spelling mistakes.
 

LITERATURE STUDY:

There has been a lot of effort put into the domain of Sentiment analysis in recent times.
The initial approaches of the problem used linguistic knowledge, like employing a list of pre-selected words, and other techniques that required knowledge about the data to be classified. An attempt to automate the method is seen in the works of Turney(2002) presenting a simple algorithm, called semantic orientation, for detecting sentiment. But the real advancement came from the work of Bo. Pang(2002). They introduced the concept of supervised learning techniques as a solution to this problem. Various degrees of boosting has also been employed to achieve better results.


DATA REQUIRED AND BASIC IDEA:

A technique called k-nearest neighbor is used wherein various stop-words like common prepositions and pronouns are removed and each keyword is assigned a TDF-IDF(Term-frequency and Document-frequency) measure.
Each answer is then converted to an incidence vector the distance of which is used to find the closest k-training answers.

Reviews of the specific product are collected from a few selected websites. Tokenization and parsing methods are employed to extract meaningful words from the reviews.
Algorithms to remove stop words are used. Extracted words are compared with words from some online dictionary containing clusters of words(like wordnet) which will determine the fraction of positive and negative words used in the review. If positive content>negative content, the sentiment of the review is classified as positive, else negative.
NER can be used to divide product into features and analyse each feature in a review using the same algorithm as mentioned  above. For eg. Take iphone 6 as the product. Features will be Touch, display, camera resolution etc.
 

ESTIMATED TIME REQUIRED: 1.5 months

MEMBERS:
1.Kavya
2.Shailee
3.Deepthi
4.Nidhi
5.Medhini
6.Gunjan
7.Suryansh
8.Balaji
