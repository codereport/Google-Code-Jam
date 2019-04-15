-- code_report Solution
-- Video Link: https://youtu.be/SIRDTt89zKk
-- Problem Link: https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/00000000000881da

import Control.Monad
import qualified Data.ByteString.Char8 as B
readInt = readLn :: IO Int

everySecond :: [a] -> [a]
everySecond [] = []
everySecond (a:b:c) = b : everySecond c

solve :: String -> String
solve = map (\c -> if c == 'E' then 'S' else 'E')

format :: (Int, String) -> String
format (x,s) = "Case #" ++ show x ++ ": " ++ s  

main :: IO ()
main = do
    t <- readInt
    v <- replicateM (2 * t) $ getLine
    mapM_ putStrLn $ map format $ zip [1..] $ map solve $ everySecond v 
