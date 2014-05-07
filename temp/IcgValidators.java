
  
  
  // --------------------------------------------------------------------------------------------------------------------
  // config
  
    
    /**
    
      * @hidden
    
    
     */
    class IcgValidators {
      
    }
  
    
    /**
    
      * @opt horizontal
    
      * @opt attributes
    
      * @opt operations
    
      * @hidden
    
    
     */
    class UMLOptions {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // interpreters
  
    
    /**
    
    
      * @opt nodefillcolor gold
    
     */
    class ExpiryDateInterpreter {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor gold
    
     */
    class MfgOriginInterpreter {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // validators
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class CanInterpretMfgDateValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class CanRunValidations {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ExpiryDateParsingValidator {
      
    }
  
    
    /**
    
      * @depend - - - ExpiryDateInterpreter
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ExpiryDateRangeValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ExpiryDateValidator {
      
    }
  
    
    /**
    
      * @depend - - - ExpiryDateInterpreter
    
    
      * @opt nodefillcolor palegreen
    
     */
    class FinishedGoodProductionDateLimitValidator {
      
    }
  
    
    /**
    
      * @depend - - - MfgOriginInterpreter
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ManufacturingOriginValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class PickStrategyValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class QualifiedItemsPresenceValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ShelfLifeValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class StopShipDateRangeValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class StopShipDateValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class StopShipLimitValidator {
      
    }
  
    
    /**
    
      * @depend - - - CanInterpretMfgDateValidator
    
      * @depend - - - CanRunValidations
    
      * @depend - - - ExpiryDateParsingValidator
    
      * @depend - - - ExpiryDateRangeValidator
    
      * @depend - - - ExpiryDateValidator
    
      * @depend - - - FinishedGoodProductionDateLimitValidator
    
      * @depend - - - ManufacturingOriginValidator
    
      * @depend - - - PickStrategyValidator
    
      * @depend - - - QualifiedItemsPresenceValidator
    
      * @depend - - - ShelfLifeValidator
    
      * @depend - - - StopShipDateRangeValidator
    
      * @depend - - - StopShipDateValidator
    
      * @depend - - - StopShipLimitValidator
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ValidationPipeline {
      
    }
  
