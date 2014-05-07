
  
  
  // --------------------------------------------------------------------------------------------------------------------
  // config
  
    
    /**
    
      * @hidden
    
    
     */
    class IcgBasic {
      
    }
  
    
    /**
    
      * @opt vertical
    
      * @opt attributes
    
      * @opt operations
    
      * @hidden
    
    
     */
    class UMLOptions {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // base
  
    
    /**
    
      * @depend - - - CodeGenerationService
    
    
      * @opt nodefillcolor lightgray
    
     */
    class CodeGenerationController {
      
        void generate_lot_code() {}
      
        void generate_expiry_date() {}
      
    }
  
    
    /**
    
      * @depend - - - MaterialsValidationConfig
    
      * @depend - - - MaterialsValidationService
    
      * @depend - - - ProductionParameters
    
      * @depend - - - ProductionProvider
    
      * @depend - - - RuleService
    
    
      * @opt nodefillcolor lightgray
    
     */
    class CodeGenerationService {
      
    }
  
    
    /**
    
      * @has - - - Customer
    
    
      * @opt nodefillcolor lightgray
    
     */
    class MaterialsValidationConfig {
      
    }
  
    
    /**
    
      * @depend - - - ValidatingMaterials
    
    
      * @opt nodefillcolor lightgray
    
     */
    class MaterialsValidationService {
      
    }
  
    
    /**
    
      * @has - - - Driver
    
      * @depend - - - MfgDatesInterpreter
    
    
      * @opt nodefillcolor lightgray
    
     */
    class ProductionProvider {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceDataTable
    
    
      * @opt nodefillcolor lightgray
    
     */
    class ReferenceData {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceData
    
      * @depend - - - Rule
    
    
      * @opt nodefillcolor lightgray
    
     */
    class RuleService {
      
    }
  
    
    /**
    
      * @depend - - - ValidationPipeline
    
    
      * @opt nodefillcolor lightgray
    
     */
    class ValidatingMaterials {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // drivers
  
    
    /**
    
      * @has - - - Rule
    
      * @depend - creates - Scope
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class ProductionParameters {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class Driver {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // rules
  
    
    /**
    
    
      * @opt nodefillcolor lightblue
    
     */
    class ReferenceDataField {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightblue
    
     */
    class ReferenceDataRow {
      
    }
  
    
    /**
    
      * @composed - - - ReferenceDataField
    
      * @composed - - - ReferenceDataRow
    
    
      * @opt nodefillcolor lightblue
    
     */
    class ReferenceDataTable {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightblue
    
     */
    class Rule {
      
    }
  
    
    /**
    
      * @composed_HIDE  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class GenerateExpiryRule extends Rule {
      
    }
  
    
    /**
    
      * @composed  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class GenerateLotRule extends Rule {
      
    }
  
    
    /**
    
      * @composed_HIDE  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class InterpretExpiryRule extends Rule {
      
    }
  
    
    /**
    
      * @composed  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class InterpretLotRule extends Rule {
      
    }
  
    
    /**
    
      * @depend - - - Driver
    
      * @depend - - - ReferenceDataTable
    
      * @depend - - - ReferenceDataField
    
    
      * @opt nodefillcolor lightblue
    
     */
    class RuleFragment {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // scopes
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class Scope {
      
        void qualified_items() {}
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // validators
  
    
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
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // sync
  
    
    /**
    
      * @depend - - - ReferenceDataRow
    
    
      * @opt nodefillcolor khaki
    
     */
    class ReferenceDataSyncer {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // domain
  
    
    /**
    
      * @composed - - - Customer
    
      * @composed - - - Site
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Account {
      
    }
  
    
    /**
    
      * @composed - - - ReferenceDataTable
    
      * @composed - - - Rule
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Customer {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Job {
      
    }
  
    
    /**
    
      * @composed - - - Job
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Line {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Shift {
      
    }
  
    
    /**
    
      * @composed - - - Line
    
      * @composed - - - Shift
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Site {
      
    }
  
