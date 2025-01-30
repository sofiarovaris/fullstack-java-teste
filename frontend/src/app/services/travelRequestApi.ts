import type { TravelRequestType } from "../types/travelRequestType";

const API_URL = process.env.NEXT_PUBLIC_API_URL || "http://localhost:8000";

/**
 * This function sends a GET request to the '/api/travel-requests/last-three-months' endpoint
 * of the API and retrieves a list of travel requests. It returns an object containing the
 * fetched data and the total number of requests.
 * 
 * @returns {Promise<{ data: TravelRequestType[], total: number }>} A promise that resolves with
 *          an object containing the fetched travel request data and the total number of records.
 * @throws {Error} Will throw an error if the API request fails.
 */
export async function fetchTravelRequests(): Promise<{ data: TravelRequestType[], total: number }> {
  try {
    const response = await fetch(`${API_URL}/api/travel-requests/last-three-months`);
    const result = await response.json();
    return { data: result, total: result.length };
  } catch (error) {
    return { data: [], total: 0 };
  }
}
